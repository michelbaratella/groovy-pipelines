pipeline {
    agent any
    
    stages {
        stage ("Test Stage 1") {
            steps {
                script {
                    echo "Stage 1"
                }
            }
        }
        stage ("Test Stage 2") {
            steps {
                script {
                    echo "Stage 2"
                }
            }
        }
        stage ("Test Stage 3") {
            steps {
                script {
                    echo "Stage 3"
                }
            }
        }
        stage ("Test Stage 4") {
            steps {
                script {
                    echo "Stage 4"
                }
            }
        }
    }
}
