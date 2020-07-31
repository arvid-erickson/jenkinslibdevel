// @Library('your-library-name')_
@Library('github.com/arvid-erickson/jenkinslibdevel') _

node {
    stage('Git Checkout') {
        checkout scm
    }
    stage('pull library') {
        sayHello()
    }    
    stage('pull a second library') {
        HelloDemo2()
    }    
}
