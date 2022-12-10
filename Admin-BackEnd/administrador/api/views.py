from django.http.response import JsonResponse
from django.utils.decorators import method_decorator
from django.views import View
from django.views.decorators.csrf import csrf_exempt
from .models import Dispositivo
from .models import Usuario
import json

# Create your views here.

class DispositivoView(View):

    @method_decorator(csrf_exempt)
    def dispatch(self, request, *args, **kwargs):
        return super().dispatch(request, *args, **kwargs)    

    def get(self, request, id=0):
        if (id>0):
            dispositivos = list(Dispositivo.objects.filter(id=id).values())
            if len(dispositivos) > 0:
                dispositivo = dispositivos[0]
                datos = {'message': "Success", 'dispositivo': dispositivo}
            else:
                datos = {'message': "Dispositivo no encontrado"}
            return JsonResponse(datos)

        else:
            dispositivos = list(Dispositivo.objects.values())
            if len(dispositivos) > 0:
                datos = {'message': "Success", 'dispositivos': dispositivos}
            else:
                datos = {'message': "Dispositivos no encontrados"}
            return JsonResponse(datos)

    def post(self, request):
        # print(request.body)
        jd=json.loads(request.body)
        # print(jd)
        Dispositivo.objects.create(dni=jd['dni'])
        datos = {'message': "Success"}
        return JsonResponse(datos)

    def put(self, request, id):
        jd=json.loads(request.body)
        dispositivos = list(Dispositivo.objects.filter(id=id).values())
        if len(dispositivos) > 0:
            dispositivo = Dispositivo.objects.get(id=id)
            dispositivo.dni = jd['dni']
            dispositivo.save()
            datos = {'message': "Success"}
        else:
            datos = {'message': "Dispositivo no encontrado"}
        return JsonResponse(datos)

    def delete(self, request, id):
        dispositivos = list(Dispositivo.objects.filter(id=id).values())
        if len(dispositivos) > 0:
            Dispositivo.objects.filter(id=id).delete()
            datos = {'message': "Success"}
        else:
            datos = {'message': "Dispositivo no encontrado"}
        return JsonResponse(datos)


#########################################################

class UsuarioView(View):

    @method_decorator(csrf_exempt)
    def dispatch(self, request, *args, **kwargs):
        return super().dispatch(request, *args, **kwargs)

    def get(self, request, id=0):
        if (id>0):
            usuarios = list(Usuario.objects.filter(id=id).values())
            if len(usuarios) > 0:
                usuario = usuarios[0]
                datos = {'message': "Success", 'usuario': usuario}
            else:
                datos = {'message': "Usuario no encontrado"}
            return JsonResponse(datos)
        else:    
            usuarios = list(Usuario.objects.values())
            if len(usuarios) > 0:
                datos = {'message': "Success", 'usuarios': usuarios}
            else:
                datos = {'message': "Usuarios no encontrados"}
            return JsonResponse(datos)

    def post(self, request):
        # print(request.body)
        jd=json.loads(request.body)
        # print(jd)
        Usuario.objects.create(apellido=jd['apellido'], nombre=jd['nombre'], dni=jd['dni'], correo=jd['correo'], dispositivo_id=jd['dispositivo_id'])
        datos = {'message': "Success"}
        return JsonResponse(datos)

    def put(self, request, id):
        jd=json.loads(request.body)
        usuarios = list(Usuario.objects.filter(id=id).values())
        if len(usuarios) > 0:
            usuario = Usuario.objects.get(id=id)
            usuario.apellido = jd['apellido']
            usuario.nombre = jd['nombre']
            usuario.dni = jd['dni']
            usuario.correo = jd['correo']
            usuario.dispositivo_id = jd['dispositivo_id']
            usuario.save()
            datos = {'message': "Success"}
        else:
            datos = {'message': "Usuario no encontrado"}
        return JsonResponse(datos)

    def delete(self, request, id):
        usuarios = list(Usuario.objects.filter(id=id).values())
        if len(usuarios) > 0:
            Usuario.objects.filter(id=id).delete()
            datos = {'message': "Success"}
        else:
            datos = {'message': "Usuario no encontrado"}
        return JsonResponse(datos)