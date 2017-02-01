from flask import Flask
from flask import request

app = Flask(__name__) # nuevo objeto

@app.route('/')       # wrap o un decorador con entrada localhost:8000
def index ():		  # Se usa una funcion
	return 'Hola mundo '


@app.route('/params')       # wrap o un decorador con el nombre del parametro "saluda"
def params ():		  # Se usa una funcion
	param=request.args.get('params1','no contiene este parametro')
	return 'el parametro es: {}'.format(param)

if __name__=='__main__':
	app.run(debug=True,port=8000) # Ejecuta el servidor por default en el puerto 8000 y esta pendiente de los cambios

