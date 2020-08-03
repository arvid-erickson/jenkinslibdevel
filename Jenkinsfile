// @Library('your-library-name')_
@Library('github.com/arvid-erickson/jenkinslibdevel') _

// env.workspace = ''
env.workspace = pwd()

node {
  stage('pull library (1)') {
    sayHello()
  }  
  
  stage('exec cleanup') {
    cleanup() 
  }
  
  stage('pull a second library (3)') {
    HelloDemo2()
  }
}
