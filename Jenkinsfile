// @Library('your-library-name')_
@Library('github.com/arvid-erickson/jenkinslibdevel') _

env.workspace = ''

node {
    stage('pull library (1)') {
      sayHello()
      }  
  /*
    stage('exec cleanup') {
      env.workspace = pwd()
      cleanup() 
    }
  */
    stage('pull a second library (3)') {
      HelloDemo2()
    }
 
}
