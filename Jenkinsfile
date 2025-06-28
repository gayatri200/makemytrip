pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '3', artifactNumToKeepStr: '3'))
    }

    tools {
        maven 'mvn_3.9.9'  // Make sure this Maven tool is defined in Jenkins global tools $
    }
    stages {
        stage("Code Compilation") {
            steps {
                echo "Code Compilation"
                sh 'mvn clean compile'
                echo 'Code Compilation Completed Successfully!'
            }
        }

        stage("Code Package") {
            steps {
                echo "Code Package"
                sh 'mvn clean package'
                echo 'Code Package Completed Successfully!'
            }
        }
    }
}
