//to run single linux command use sh before that
pipeline{
    agent any

    stages {
        stage('Build'){
            steps
            {
               sh 'date'
               sh 'pwd'
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
