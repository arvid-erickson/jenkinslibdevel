// @Library('your-library-name')_
@Library('github.com/arvid-erickson/jenkinslibdevel') _

env.workspace = ''

stage('pull library') {
    sayHello()
    echo sh(returnStdout: true, script: 'env')
}    
stage('pull a second library') {
    HelloDemo2()
}
