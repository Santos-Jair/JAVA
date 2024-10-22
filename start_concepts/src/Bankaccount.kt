class BankAccount(private var _balance: Double, val accountHolder: String) {
    val balance: Double
        get() = _balance
    fun deposit(amount: Double) {
        if (amount > 0) {
            _balance += amount
            println("Depósito de R$$amount realizado com sucesso. Saldo atual: R$$_balance")
        } else {
            println("O valor do depósito deve ser maior que zero.")
        }
    }
    fun withdraw(amount: Double) {
        if (amount > 0) {
            if (_balance >= amount) {
                _balance -= amount
                println("Saque de R$$amount realizado com sucesso. Saldo atual: R$$_balance")
            } else {
                println("Saldo insuficiente para realizar o saque. Saldo atual: R$$_balance")
            }
        } else {
            println("O valor do saque deve ser maior que zero.")
        }
    }
}
fun main() {

    val account = BankAccount(1000.0, "João Silva")

    println("Saldo inicial de ${account.accountHolder}: R$${account.balance}")
    account.deposit(500.0)
    account.withdraw(300.0)
    account.withdraw(1500.0)

    // account.balance = 2000.0 // Isso geraria um erro de compilação, pois o setter foi bloqueado
}
