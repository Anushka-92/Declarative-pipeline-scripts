pipeline{
    agent any
    environment{
        PATH = "/opt/maven/bin:$PATH"
    }
    stages {
        stage('git clone') {
            steps {
               git url: 'https://github.com/Anushka-92/simple-java-maven-app.git', branch: 'master'
            }
        }
        stage('build') {
            steps{
            //Run maven goal
               sh 'mvn clean install'
            }
        }
    }
}