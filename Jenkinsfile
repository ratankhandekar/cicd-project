pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/ratankhandekar/cicd-project.git' // Replace with your repo URL
            }
        }
        stage('Build') {
            steps {
                sh './mvn clean package' // Use 'mvn clean package' if mvnw is missing
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
