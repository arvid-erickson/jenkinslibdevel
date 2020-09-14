!#/usr/bin/env groovy
// /vars/pipeline.groovy

def call(Map pipelineParams) {
  stage("Checkout") { 
    println 'Checkout stage'
  }  
  stage("build") { 
    println 'Build stage' 
  }
  stage("Deployment") {
    println 'Deployment'
  }
  stage("Activation") {
    println 'Activation'
  }
  stage("Restart") {
    println 'Restart'
  }
  stage("Cleanup") {
    println 'Cleanup'
  }
}
