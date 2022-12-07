pipeline {
    agent none
    stages {
        stage('Build') { 
            steps {
                echo "Hello Maven!!!"
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}