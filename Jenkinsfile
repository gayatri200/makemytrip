pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '3', artifactNumToKeepStr: '3'))
    }

    parameters {
        string(name: 'maven_version', defaultValue: '3.9.9', description: 'Enter Maven version')
    }

    stages {
        stage("Download Maven version") {
            steps {
                echo "Maven version: ${params.maven_version}"
                sh 'mvn clean compile'
                echo 'Maven version fetched successfully!'
            }
        }
    }
}
