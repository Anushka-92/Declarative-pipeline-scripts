//You can see output in stage view using Pipeline by clicking on logs ofrespective stage
pipeline{
    agent any

    stages {
        stage('Build'){
            steps
            {
                echo "Building.."
              }
            }
        stage('Test'){
            steps
            {
                echo "Testing.."
              }
            }
        stage('Deploy'){
            steps
            {
                echo "Deploying.."
              }
            }        
        }
    }
