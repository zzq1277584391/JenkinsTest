pipeline {
    agent { label 'WIN10' }

    stages {
        stage('Build') {
            steps {
                script {
                    // 执行 PowerShell 脚本
                    bat 'echo Hello, Jenkins!'

                    // 或者执行 PowerShell 脚本
                    powershell 'Write-Host "Hello from PowerShell!"'
                }
            }
        }
    }
}