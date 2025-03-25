pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/ratankhandekar/cicd-project.git'
            }
        }

        stage('Build') {
            steps {
                sh '/usr/bin/mvn clean package' // Use './mvn' if Maven Wrapper is available
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t myapp:latest .' // Build Docker image
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker stop myapp || true && docker rm myapp || true' // Stop old container if running
                sh 'docker run -d -p 9090:9090 --name myapp myapp:latest' // Start new container
            }
        }
    }
}
