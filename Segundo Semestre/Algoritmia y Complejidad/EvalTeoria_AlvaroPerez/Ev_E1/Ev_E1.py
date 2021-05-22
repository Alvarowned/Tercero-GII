# Formato -> [['Usuario', ['Contacto1','Contacto2']], [...]]
def generarCont(fIn):
    contactos = []
    for i in fIn:
        text = i[:len(i)-1]
        info = text.split(":")
        if(info[1] != ''):
            info[1] = info[1].split(",")
        else:
            info[1] = []
        contactos.append(info)
    return contactos

def algorConect(contactos, fOut):
    grupos = []
    for i in contactos:
        grupo = []
        grupo.append(i[0])
        for j in i[1]:
            grupo.append(j)
        flag = False
        for pers in range(0, len(grupo)):
            for g in range(0, len(grupos)):
                if((not flag) and (grupo[pers] in grupos[g])):
                    grupos[g] += grupo
                    flag = True
        if(not flag):
            grupos.append(grupo)
    for elem in range(0, len(grupos)):
        grupos[elem] = list(set(grupos[elem]))
    fOut.write("Grupos: \n")
    for g in range(0, len(grupos)):
        fOut.write("\tGrupo " + str(g) + " -> " + str(grupos[g]) + "\n")
    media = float(len(grupos))/float(len(contactos))
    fOut.write("\nEl resultado de dividir " + str(len(grupos)) + " grupos entre " + str(len(contactos)) + " personas sería " + str(media) + ".")

fIn = open('ejemplo_voraz.txt', 'r')
fOut = open('salida_voraz.txt', 'w')
contactos = generarCont(fIn)
fIn.close()
algorConect(contactos, fOut)
fOut.close()
