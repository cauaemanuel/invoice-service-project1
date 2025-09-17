pipeline {
    agent any
    tools {
        maven 'Maven 3.9.11' // ou o nome configurado no Jenkins
    }
    stages {

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}