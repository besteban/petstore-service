node('maven') {
  stage('Build') {
    git url: "https://github.com/besteban/petstore-service.git"
    sh "mvn package"
    stash name:"jar", includes:"target/petstore.jar"
  }
  stage('Test') {
    parallel(
      "petstore Tests": {
        sh "mvn verify -P petstore-tests"
      }
    )
  }
  stage('Build Image') {
    unstash name:"jar"
    sh "oc start-build petstore --from-file=target/petstore.jar --follow"
  }
  stage('Deploy') {
    openshiftDeploy depCfg: 'petstore'
    openshiftVerifyDeployment depCfg: 'petstore', replicaCount: 1, verifyReplicaCount: true
  }
  stage('System Test') {
    sh "curl -s -X POST http://petstore:8080/api/cart/dummy/666/1"
    sh "curl -s http://cart:8080/api/petstore/dummy | grep 'Dummy Product'"
  }
}
