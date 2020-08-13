// @Library('your-library-name')_
@Library('github.com/arvid-erickson/jenkinslibdevel') _

env.workspace = ''
/*
node {
*/
    stage("Interactive_Input") {
      steps {
        script {

          // Variables for input
          def inputConfig
          def inputTest

          // Get the input
          def userInput = input(
                            id: 'userInput', message: 'Enter path of test reports:?',
                            parameters: [

                                    string(defaultValue: 'None',
                                            description: 'Path of config file',
                                            name: 'Config'),
                                    string(defaultValue: 'None',
                                            description: 'Test Info file',
                                            name: 'Test'),
                            ])

          // Save to variables. Default to empty string if not found.
          inputConfig = userInput.Config?:''
          inputTest = userInput.Test?:''

          // Echo to console
          echo("IQA Sheet Path: ${inputConfig}")
          echo("Test Info file path: ${inputTest}")

          // Write to file
          writeFile file: "inputData.txt", text: "Config=${inputConfig}\r\nTest=${inputTest}"

          // Archive the file (or whatever you want to do with it)
          archiveArtifacts 'inputData.txt'
              }
            }
          }
        }
    stage('pull library (1)') {
      sayHello()
      }  
    stage('pull library (2)') {
      sayHello()
      }
    stage('pull library (3)') {
      HelloDemo2()
      }  
    stage('pull library (4)') {
      sayHello()
      }  
    stage('pull a second library (3)') {
      HelloDemo2()
    }

/* 
}
*/
