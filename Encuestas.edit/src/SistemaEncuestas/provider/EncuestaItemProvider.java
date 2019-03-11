/**
 */
package SistemaEncuestas.provider;


import SistemaEncuestas.Encuesta;
import SistemaEncuestas.SistemaEncuestasFactory;
import SistemaEncuestas.SistemaEncuestasPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link SistemaEncuestas.Encuesta} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EncuestaItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncuestaItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTituloPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Titulo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTituloPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Encuesta_titulo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Encuesta_titulo_feature", "_UI_Encuesta_type"),
				 SistemaEncuestasPackage.Literals.ENCUESTA__TITULO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SistemaEncuestasPackage.Literals.ENCUESTA__ELEMENTO);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Encuesta.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Encuesta"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Encuesta)object).getTitulo();
		return label == null || label.length() == 0 ?
			getString("_UI_Encuesta_type") :
			getString("_UI_Encuesta_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Encuesta.class)) {
			case SistemaEncuestasPackage.ENCUESTA__TITULO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SistemaEncuestasPackage.ENCUESTA__ELEMENTO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SistemaEncuestasPackage.Literals.ENCUESTA__ELEMENTO,
				 SistemaEncuestasFactory.eINSTANCE.createModulo()));

		newChildDescriptors.add
			(createChildParameter
				(SistemaEncuestasPackage.Literals.ENCUESTA__ELEMENTO,
				 SistemaEncuestasFactory.eINSTANCE.createSaltoRespuesta()));

		newChildDescriptors.add
			(createChildParameter
				(SistemaEncuestasPackage.Literals.ENCUESTA__ELEMENTO,
				 SistemaEncuestasFactory.eINSTANCE.createPregunta()));

		newChildDescriptors.add
			(createChildParameter
				(SistemaEncuestasPackage.Literals.ENCUESTA__ELEMENTO,
				 SistemaEncuestasFactory.eINSTANCE.createSaltoInicio()));

		newChildDescriptors.add
			(createChildParameter
				(SistemaEncuestasPackage.Literals.ENCUESTA__ELEMENTO,
				 SistemaEncuestasFactory.eINSTANCE.createSaltoPregunta()));

		newChildDescriptors.add
			(createChildParameter
				(SistemaEncuestasPackage.Literals.ENCUESTA__ELEMENTO,
				 SistemaEncuestasFactory.eINSTANCE.createSaltoFinRespuesta()));

		newChildDescriptors.add
			(createChildParameter
				(SistemaEncuestasPackage.Literals.ENCUESTA__ELEMENTO,
				 SistemaEncuestasFactory.eINSTANCE.createSaltoFinPregunta()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EncuestasEditPlugin.INSTANCE;
	}

}
