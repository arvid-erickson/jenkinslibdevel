!#/usr/bin/env groovy
// /vars/pipeline.groovy

def call (Map pipelineParams) {
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
  /*
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
  } */
}
