// @Library('your-library-name')_
@Library('github.com/arvid-erickson/jenkinslibdevel')_

library(
  identifier: 'jenkinslibdevel@master',
  retriever: modernSCM(
    [
      $class: 'GitSCMSource',
      remote: 'https://github.com/arvid-erickson/jenkinslibdevel.git'
    ]
  )
)

stage("build") {}
stage("Deployment") {}
checkpoint("checkpoint after deployment and before middleware componenets activation")
stage("Activation") {}
checkpoint("checkpoint after middleware compoonets activation and before ACM restart")
stage("Restart") {}
checkpoint("checkpoint after ACM restart and before missleware component cleanup")
stage("Cleanup") {}
