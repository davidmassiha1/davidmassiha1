pipeline {
    agent {
        node { label 'jenkins-server'}
    }
    stages {
        stage('Build') { 
            steps {
                echo "Hello Maven!!!"
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}