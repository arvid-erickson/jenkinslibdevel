!#/usr/bin/env groovy
// /vars/pipeline.groovy

// def call (Map pipelineParams) {
def call() {
node {
    stages {
    def pipeline
      stage('Git Checkout') {
        checkout scm
      }
      stage('Build') {
        build()
      }
      stage('Deplotment') {
        deployment()
      }
      stage('Activation') {
        activation()
      }
      stage('Restart') {
        restart()
      }
      stage('Cleanup') {
        cleanup()
      }
    }
  } 
}
