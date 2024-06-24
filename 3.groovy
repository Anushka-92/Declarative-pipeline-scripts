//to run multiple linux command use sh'''  before them

pipeline{
    agent any

    stages {
        stage('stage 1') {
            steps{
                sh'''
                ls
                date
                cal 2023
                '''
            }
        }
    }
}