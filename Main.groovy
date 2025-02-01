pipeline {
    agent { label 'WIN10' }

    stages {
        stage('Build') {
            steps {
                script {
                    // 简单输出确认任务正在执行
                    def output = sh(script: "ssh 12775@172.22.64.1 'dir'", returnStdout: true).trim()
                    echo "Command output: ${output}"
                }
            }
        }
    }
}