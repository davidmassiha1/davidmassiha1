#!/usr/bin/env groovy

pipeline {
  agent any

  stages {
    stage('Build Stage') {

      steps {
        sh '/opt/maven/bin/mvn clean install -DskipTests'

      }
      }
  }
    
}
    
