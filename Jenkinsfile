// @Library('your-library-name')_
@Library('github.com/arvid-erickson/jenkinslibdevel') _

// This shows a simple example of how to archive the build output artifacts.

   stage ("Module test") {
       def rootdir = pwd()
       def exampleModule = load "${rootDir}@script/Example.Groovy"
      echo("Example.groovy loaded");
       exampleModule.exampleMethod()
      echo("exampleModule.exampleMethod() run")
       exampleMdoule.otherExampleMethod()
      echo("exampleModule.otherExampleMethod() run")
   }
