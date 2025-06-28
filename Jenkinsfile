pipeline {
    agent any

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
