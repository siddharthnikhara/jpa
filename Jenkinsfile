pipeline {
  environment {
    imagename = "user-mysql"
    registryCredential = 'siddharthdockerid-Sn@782870'
    dockerImage = ''
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
        git([url: 'https://github.com/siddharthnikhara/test.git', branch: 'master', credentialsId: 'siddharthnikhara@gmail.com'])

      }
    }
    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build user-mysql
        }
      }
    }
  }
}