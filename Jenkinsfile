pipeline {
    agent any
    stages {
        stage('Build image') {
            steps {
                echo 'Starting to build docker image'

                script {
                    def customImage = docker.build("user-mysql:${env.BUILD_ID}")
                    customImage.push()
                }
            }
        }
    }
}