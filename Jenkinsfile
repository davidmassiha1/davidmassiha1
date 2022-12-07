pipeline {
    agent {
        label 'jenkins-server'
    }
    stages {
        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }
        stage('Build Docker Container') {
            steps {
                script {
                    sh 'mvn -B -DskipTests clean install'
                    
                }
            }
        }
    }
}