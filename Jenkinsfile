pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		git 'https://github.com/subrata75/MTour'    
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
		git 'https://github.com/subrata75/MTour'      
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
		git 'https://github.com/subrata75/MTour'      
            }
        }
	}
}
