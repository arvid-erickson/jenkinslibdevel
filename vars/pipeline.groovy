!#/usr/bin/env groovy
// /vars/pipeline.groovy

def call (Map pipelineParams) {
  pipeline {
    agent none

    stages {
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
