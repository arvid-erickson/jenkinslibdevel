// @Library('your-library-name')_

/* stage('Demo') {
     echo 'Hello world'
     sayHello 'Dave'
 } */

node {
    stage("Checkout"){
        checkout([
            // checkout source code
        ])
    }
    stage("Compile"){
        sh("${tool 'Apache Maven 3.3.9'}/bin/mvn compile")
    }
    stage("Test"){
        sh("${tool 'Apache Maven 3.3.9'}/bin/mvn test")
    }
    stage("Install"){
        sh("${tool 'Apache Maven 3.3.9'}/bin/mvn install")
    }
}
