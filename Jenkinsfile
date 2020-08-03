// @Library('your-library-name')_
@Library('github.com/arvid-erickson/jenkinslibdevel') _

env.workspace = ''

node {
stage('pull library (1)') {
    sayHello()
}  

stage('Print env testing (2)') {
//    printParams()
//    env.getEnvironment().each { name, value -> println "Name: $name -> Value $value" }
//    sh 'env'
//    echo sh(script: 'env', returnStdout: true)
//        echo sh(returnStdout: true, script: 'env')
//    steps {
      sh 'printenv'
//    }
}

stage('pull a second library (3)') {
    HelloDemo2()
}
}
