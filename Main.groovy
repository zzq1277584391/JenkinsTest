pipeline {
    agent none

    stages {
        stage('Build') {
            steps {
                node("WIN10")
                {
                    script {
                        // 简单输出确认任务正在执行
                        def result = bat(script: 'echo Hello World', returnStdout: true).trim()
                        echo "Command output: ${result}"    
                    }
                }

            }
        }
    }
}