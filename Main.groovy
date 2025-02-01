pipeline {
    agent { label 'WIN10' }

    stages {
        stage('Build') {
            steps {
                script {
                    // 简单输出确认任务正在执行
                    def result = bat(script: 'echo Hello World', returnStdout: true).trim()
                    echo "Command output: ${result}"    
                }
            }
        }
    }
}