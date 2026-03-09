pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/tspatel02/java-devops-lab.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Unit Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Code Coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

    }

    post {

        always {
            junit '**/target/surefire-reports/*.xml'
        }

    }

}
