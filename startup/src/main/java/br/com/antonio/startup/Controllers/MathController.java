package br.com.antonio.startup.Controllers;

import br.com.antonio.startup.Converters.NumberConverter;
import br.com.antonio.startup.Math.SimpleMath;
import br.com.antonio.startup.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private SimpleMath math = new SimpleMath();

    @GetMapping
    @RequestMapping("/soma/{numberOne}/{numberTwo}")
    public Double soma(@PathVariable(value = "numberOne") String numberOne, @PathVariable (value = "numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsupportedMathOperationException("Por favor informe um número valido");
        } else {
            return math.soma(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
        }
    }

    @RequestMapping("/subtracao/{numberOne}/{numberTwo}")
    public Double subtracao(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo){
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsupportedMathOperationException("Por favor informe um número valido");
        } else {
            return math.subtracao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
        }
    }

    @RequestMapping("/multiplicacao/{numberOne}/{numberTwo}")
    public Double multiplicacao(@PathVariable (value = "numberOne") String numberOne, @PathVariable (value = "numberTwo") String numberTwo){
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Por favor insira um número válido");
        } else {
            return math.multiplicacao (NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
        }
    }

    @RequestMapping("/divisao/{numberOne}/{numberTwo}")
    public Double divisao(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo){
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Por favor insira um número válido");
        } else {
            return math.divisao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
        }
    }

    @RequestMapping("media/{numberOne}/{numberTwo}")
    public Double media(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo){
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Por favor insira um número válido");
        } else {
            return math.media(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
        }
    }

    @RequestMapping("raizquadrada/{numberOne}/{numberTwo}")
    public Double raizquadrada(@PathVariable(value = "numberOne") String numberOne) {
        if (!NumberConverter.isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("Por favor insira um número válido");
        } else {
            return math.raizQuadrada(NumberConverter.convertToDouble(numberOne));
        }

    }





}
