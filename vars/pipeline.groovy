!#/usr/bin/env groovy
// /vars/pipeline.groovy

// def call (Map pipelineParams) {
def call() {
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
