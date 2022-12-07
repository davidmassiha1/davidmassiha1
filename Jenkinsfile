pipeline {
    agent {
        node {
            label 'my first build'
            customworkspace '/opt/maven/'
        } 
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}