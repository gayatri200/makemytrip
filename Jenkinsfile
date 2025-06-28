pipeline {
    agent any

    stages {
        stage('Check Java version') {
            steps {
                sh 'java --version'
            }
        }

        stage('Check git version') {
            steps {
                sh 'git --version'
            }
        }
    }
}
