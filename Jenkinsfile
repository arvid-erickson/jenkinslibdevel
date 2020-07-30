// @Library('your-library-name')_
@Library('github.com/arvid-erickson/jenkinslibdevel') _

node {
    stage('Git Checkout') {
        checkout scm
    }
    stage('pull library') {
        
    }
}

// This shows a simple example of how to archive the build output artifacts.
/*
   stage ("Module test") {
       def rootdir = pwd()
       def exampleModule = load "${rootDir}@script/Example.Groovy"
       echo("loading library")
       exampleModule.exampleMethod()
       echo("exec .exampleMethod()")
       exampleMdoule.otherExampleMethod()
       echo("exec .otherExampleMethod()")
   }
*/
sayHello()
