// @Library('your-library-name')_
@Library('github.com/arvid-erickson/jenkinslibdevel') _

// This shows a simple example of how to archive the build output artifacts.
/*
node {
   stage ("Module test") {
       def rootdir = pwd()
       def exampleModule = load "${rootDir}@script/Example.Groovy"
       exampleModule.exampleMethod()
       exampleMdoule.otherExampleMethod()
   }
}
*/
stage('Print Build Info') {
    printBuildinfo {
        name = "Sample Name"
    }
} stage('Disable balancer') {
    disableBalancerUtils()
} stage('Deploy') {
    deploy()
} stage('Enable balancer') {
    enableBalancerUtils()
} stage('Check Status') {
    checkStatus()
}
