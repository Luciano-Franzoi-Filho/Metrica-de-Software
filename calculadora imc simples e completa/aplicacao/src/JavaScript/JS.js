function verificarCampos() {
    let campos = document.querySelectorAll('.placeholder input, .placeholder select');
    let calculadora = document.querySelector('.calculadora');

    campos.forEach(function(campo) {
        if (campo.value === '') {
            calculadora.classList.add('shake');
        } else {
            calculadora.classList.remove('shake'); // Remover a animação se o campo estiver preenchido
        }

        campo.addEventListener('input', function() {
            if (campo.value !== '') {
                calculadora.classList.remove('shake');
            }
        });
    });

    setTimeout(function() {
        calculadora.classList.remove('shake');
        void calculadora.offsetWidth; // Triggers reflow to restart animation
        calculadora.classList.add('shake');
    }, 100); // Reinicia a animação após 100 milissegundos
}
