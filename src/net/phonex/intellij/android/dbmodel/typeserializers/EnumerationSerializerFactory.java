package net.phonex.intellij.android.dbmodel.typeserializers;

import com.intellij.psi.PsiType;
import com.intellij.psi.impl.source.PsiClassReferenceType;
import net.phonex.intellij.android.dbmodel.typeserializers.serializers.EnumerationSerializer;

/**
 * Modified by Dallas Gutauckis [dallas@gutauckis.com]
 */
public class EnumerationSerializerFactory implements TypeSerializerFactory {
    private TypeSerializer mSerializer = new EnumerationSerializer();

    @Override
    public TypeSerializer getSerializer(PsiType psiType) {
        if (psiType instanceof PsiClassReferenceType && ((PsiClassReferenceType) psiType).resolve().isEnum()) {
            return mSerializer;
        }

        return null;
    }
}
