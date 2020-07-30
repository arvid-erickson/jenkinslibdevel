// @Library('your-library-name')_

/* stage('Demo') {
     echo 'Hello world'
     sayHello 'Dave'
 } */
env.workspace = ''
if(env.BRANCH_NAME =~ /PR-\d+/){return}

// This shows a simple example of how to archive the build output artifacts.
node { 
// pipeline {
     stage "Create build output"
    
     // Make the output directory.
     // sh "mkdir -p output"

     // Write an useful file, which is needed to be archived.
     // writeFile file: "output/usefulfile.txt", text: "This file is useful, need to archive it."

     // Write an useless file, which is not needed to be archived.
     // writeFile file: "output/uselessfile.md", text: "This file is useless, no need to archive it."

     stage "Archive build output"
    
     // Archive the build output artifacts.
     // archiveArtifacts artifacts: 'output/*.txt', excludes: 'output/*.md'
    
     stage("Build") {
          environment {
              PATH=$PATH + '/opt/apps/buildtools/gradle-4.7/bin'    
          }
     }
     env.workspace = pwd()
     println "value of workspace is ${env.workspace}"
     if (currentBuild.rawBuild.getCauses().toString().contains("UserId")) { }
     
     stage("Deployment") { }
     stage("Activation") { }
     stage("Restart") { }
     stage("Cleanup") { }
}
