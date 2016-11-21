package darkelfe14728.personalarmor.armor.part;

/**
 * @author Julien Rosset
 * 
 *         Armor (abstract) arm part.
 */
public abstract class AbstractArm
    implements IArmorPart
{
    /**
     * @see darkelfe14728.personalarmor.armor.part.IArmorPart#getTagName()
     */
    @Override
    public String getTagName()
    {
        return "arm";
    }

    /**
     * @see darkelfe14728.personalarmor.armor.part.IArmorPart#getBaseFactor()
     */
    @Override
    public int getBaseFactor()
    {
        return 60;
    }
}
