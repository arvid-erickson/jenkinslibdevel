// @NonCPS
def printParams() {
//  env.getEnvironment().each { name, value -> println "Name: $name -> Value $value" }
//    echo sh(script: 'env|sort', returnStdout: true)
  sh "printenv"
}
