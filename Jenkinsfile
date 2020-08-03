// @Library('your-library-name')_
@Library('github.com/arvid-erickson/jenkinslibdevel') _

env.workspace = ''

node {
  stage('pull library (1)') {
    sayHello()
  }  

  stage('Print env testing (2)') {
   //   sh 'printenv'
      printParam()
      def env = System.getenv()
        env.each{
          println it
        } 
      env
  }

  stage('pull a second library (3)') {
    HelloDemo2()
  }
}
